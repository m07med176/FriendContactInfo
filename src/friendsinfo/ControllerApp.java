package friendsinfo;

import friendsinfo.DataBaseLayerAccess;
import friendsinfo.DatabaseManager;
import friendsinfo.FXMLDocumentBase;
import friendsinfo.FriendContact;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.stage.Stage;


public class ControllerApp extends FXMLDocumentBase {

    private Stage stage;
    private Connection db;
    private boolean newState = false;
    
    
    public ControllerApp(Stage stage) {
        try {
            this.stage = stage;
            db   = new DatabaseManager().getConection();
            dataBlock(false);
            FriendContact first = DataBaseLayerAccess.requestFIrst(db);
            dataSetter(first);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean dataValidation(){
        boolean fName = fNameInput.getText().trim().isEmpty();
        boolean lName = lNameInput.getText().trim().isEmpty();
        boolean mName = lNameInput.getText().trim().isEmpty();
        boolean email = emailInput.getText().trim().isEmpty();
        boolean phone = phoneInput.getText().trim().isEmpty();
        return fName && lName && mName && email && phone;
    }
    public FriendContact dataHolder(){
        
        String fName = fNameInput.getText().trim();
        String lName = lNameInput.getText().trim();
        String mName = mNameInput.getText().trim();
        String email = emailInput.getText().trim().toLowerCase();
        String phone = phoneInput.getText().trim();
        int id = Integer.parseInt(idInput.getText().trim());
        
        return new FriendContact(fName, mName, lName, id, email, phone);
    }
    
    public void dataSetter(FriendContact data){
        fNameInput.setText(data.getfName());
        lNameInput.setText(data.getlName());
        mNameInput.setText(data.getmName());
        emailInput.setText(data.getEmail());
        phoneInput.setText(data.getPhone());
        idInput.setText(String.valueOf(data.getId()));
       }
    
    public void dataClear(){
        fNameInput.clear();
        lNameInput.clear();
        mNameInput.clear();
        emailInput.clear();
        phoneInput.clear();
        idInput.clear();
       }
    
    
    public void dataBlock(boolean state){
        fNameInput.setEditable(state);
        lNameInput.setEditable(state);
        mNameInput.setEditable(state);
        emailInput.setEditable(state);
        phoneInput.setEditable(state);
        idInput.setEditable(state); 
    }
    
    
    @Override
    protected void onNew(ActionEvent actionEvent) {
        newState=!newState;
        if(newState){ 
            newBtn.setText("Save");
            updateBtn.setDisable(true);
            dataClear();
            
        }else{
            try {
                newBtn.setText("New");
                updateBtn.setDisable(false);
                DataBaseLayerAccess.requestNew(dataHolder(), db);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        dataBlock(newState); 
    }

    @Override
    protected void onUpdate(ActionEvent actionEvent) {
        newState=!newState;
        if(newState){ 
            updateBtn.setText("Save");
            
            newBtn.setDisable(true);
            
        }else{
            try {
                updateBtn.setText("Update");
                newBtn.setDisable(false);
                DataBaseLayerAccess.requestUpdate(dataHolder(), db);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        dataBlock(newState); 
        
    }

    @Override
    protected void onDelete(ActionEvent actionEvent) {
        try {
            FriendContact first = DataBaseLayerAccess.requestDelete(dataHolder().getId(), db);
            dataSetter(first);
        } catch (SQLException | IndexOutOfBoundsException ex) {
            Logger.getLogger(ControllerApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void onFIrst(ActionEvent actionEvent) {
        try {
            FriendContact first = DataBaseLayerAccess.requestFIrst(db);
            dataSetter(first);
        } catch (SQLException | IndexOutOfBoundsException ex) {
            Logger.getLogger(ControllerApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void onNext(ActionEvent actionEvent) {
        try {
            FriendContact next = DataBaseLayerAccess.requestNext(db);
            dataSetter(next);
        } catch (SQLException | IndexOutOfBoundsException ex) {
            Logger.getLogger(ControllerApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void onPrevious(ActionEvent actionEvent) {
        try {
            FriendContact previous = DataBaseLayerAccess.requestPrevious(db);
            dataSetter(previous);
        } catch (SQLException | IndexOutOfBoundsException ex) {
            Logger.getLogger(ControllerApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void onLast(ActionEvent actionEvent) {
        FriendContact last;
        try {
            last = DataBaseLayerAccess.requestLast(db);
            dataSetter(last);
        } catch (SQLException | IndexOutOfBoundsException ex) {
            Logger.getLogger(ControllerApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

}

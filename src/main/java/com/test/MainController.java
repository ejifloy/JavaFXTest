package com.test;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }

    @FXML
    private void setCheck(){

    }

    @FXML
    protected void setText() {

//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/userdb","root","pw123456");
//
//            Statement statement = connection.createStatement();
//            String sql = "SELECT * FROM userdb.users;";
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            while(resultSet.next()){
//                fxTextArea.appendText(resultSet.getString("user_name")
//                        +"\t"+resultSet.getString("user_password")
//                        +"\t"+resultSet.getBoolean("skin")
//                        +"\t"+resultSet.getBoolean("remember")+"\n");
//            }
//
//            connection.close();
//        }catch (Exception e){
//            System.out.println("Error: "+e);
//        }
    }


}

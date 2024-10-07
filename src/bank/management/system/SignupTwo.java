package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author shahi
 */
public class SignupTwo extends JFrame implements ActionListener{
    
    String formno;
    JTextField panNumber,aadharNumber;
    JRadioButton seniorCitizen,nonseniorCitizen,existingAccount,nonexistingAccount;
    JComboBox religion,category,income,education,occupation;
    JButton next;
    
    SignupTwo(String formno) {
        this.formno=formno;
        setLayout(null);
        
        setTitle("New ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);
        
        String valReligion[]={"Hindu","Muslim","Christian","Other"};
        religion= new JComboBox(valReligion); 
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);
        
        String valCategory[]={"General","OBC","SC","ST","Other"};
        category= new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);
        
        String valIncome[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income= new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel educationLabel1 = new JLabel("Educational");
        educationLabel1.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel1.setBounds(100, 290, 200, 30);
        add(educationLabel1);

        JLabel educationLabel2 = new JLabel("Qualification:");
        educationLabel2.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel2.setBounds(100, 315, 200, 30);
        add(educationLabel2);
        
        String valEducation[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education= new JComboBox(valEducation);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);
        
        String valOccupation[]={"Salaried","Self-Employeed","Bussiness","Student","Retired","Others"};
        occupation= new JComboBox(valOccupation);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel panLabel = new JLabel("PAN Number:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);

        panNumber = new JTextField();
        panNumber.setFont(new Font("Raleway", Font.BOLD, 14));
        panNumber.setBounds(300, 440, 400, 30);
        add(panNumber);

        JLabel aadharLabel = new JLabel("Aadhar Number:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);

        aadharNumber = new JTextField();
        aadharNumber.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharNumber.setBounds(300, 490, 400, 30);
        add(aadharNumber);
        
        JLabel citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);
        
        seniorCitizen = new JRadioButton("Yes");
        seniorCitizen.setBounds(300, 540, 100, 30);
        seniorCitizen.setBackground(new Color(240, 255, 240));  // Light Yellow
        add(seniorCitizen);

        nonseniorCitizen = new JRadioButton("No");
        nonseniorCitizen.setBounds(450, 540, 100, 30);
        nonseniorCitizen.setBackground(new Color(240, 255, 240));  // Light Yellow
        add(nonseniorCitizen);
        
        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(seniorCitizen);
        citizengroup.add(nonseniorCitizen);
        
        JLabel account = new JLabel("Existing Account:");
        account.setFont(new Font("Raleway", Font.BOLD, 20));
        account.setBounds(100, 590, 200, 30);
        add(account);
        
        existingAccount = new JRadioButton("Yes");
        existingAccount.setBounds(300, 590, 100, 30);
        existingAccount.setBackground(new Color(240, 255, 240));  // Light Yellow
        add(existingAccount);

        nonexistingAccount = new JRadioButton("No");
        nonexistingAccount.setBounds(450, 590, 100, 30);
        nonexistingAccount.setBackground(new Color(240, 255, 240));  // Light Yellow
        add(nonexistingAccount);
        
        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(existingAccount);
        accountgroup.add(nonexistingAccount);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);  // Dark Green
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        // Change the entire background color
        getContentPane().setBackground(new Color(240, 255, 240));  // Honeydew (Light Green)

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion_var = (String)religion.getSelectedItem();
        String category_var = (String)category.getSelectedItem();
        String income_var = (String)income.getSelectedItem();   
        String education_var = (String)education.getSelectedItem();
        String occupation_var = (String)occupation.getSelectedItem();
        String citizen = null;
        if(seniorCitizen.isSelected()){
            citizen = "Yes";
        }
        else if(nonseniorCitizen.isSelected()){
            citizen = "No";
        }
        String account = null;
        if(existingAccount.isSelected()){
            account = "Yes";
        }
        else if(nonexistingAccount.isSelected()){
            account = "No";
        }
        
        
        String pan = panNumber.getText();
        String aadhar = aadharNumber.getText();
        
        try{
            
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+religion_var+"','"+category_var+"','"+income_var+"','"+education_var+"','"+occupation_var+"','"+pan+"','"+aadhar+"','"+citizen+"','"+account+"')";
            c.s.executeUpdate(query);
            
            //signup3 Object
              setVisible(false);
              new SignupThree(formno).setVisible(true);
        }
        catch (Exception e){
                System.out.println(e);
        }
    }
    public static void main(String args[]) {
        new SignupTwo("");
    }   
}

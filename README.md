# ITS340_FinalProject
Creating an interactive Java Swing GUI for a hospital DBMS


Statement of Work (SOW) 
(Single Team Member) 
Final Project 
ITS 340 

Develop an application that interviews a patient for some general medical history data using a binary  tree to drive the process, implemented using the Java language and using the Java Swing graphical  user interface, and the MySQL database to store data. Think of the interview as a digital physician  that asks the user questions regarding their medical history. 

1. The scope of the interview will be limited to the following: 
  a. Interview for General Medical History 
    i. Blood Type 
    ii. Rh Factor 
    iii. Marital Status 
     iv. Alcohol Use – Type and Quantity, and Duration (e.g., wine twice a week) 
    v. Tobacco Use – Type and Quantity, and Duration (e.g., cigar once a week) 
    vi. Drug Usage – Type and Duration 
2. The following tables need to be built in the MySQL database: 
  a. GeneralMedicalHistoryTable 
  b. PatientTable 
3. Create a graphical user-interface that includes forms for: 1) Patient Selection, 2) Patient  Demographics, and 3) General Medical History using Java Swing.  
  a. The Patient Demographics, General Medical History and Allergy History forms must  comply with the following: 
    i. The frame (form) must have fields to display all the data from each associated  table (allergy history, general history, etc.) The General Medical History frame  will show one record from the associated table for a specific patient. The  

    Allergy history frame must be able to show many records per patient in a list.  
    ii. The frame must have buttons for Edit, New, Save, Delete, and Close.  
    iii. The screen should open in “View” mode where the text fields cannot be initially  edited (the fields are locked). The background of the text fields should be a light  gray color. When you click the Edit or New buttons, then the form changes to  
“Edit” mode where the fields can be editable. Change the text field background  to white while in “Edit” mode.  
    iv. When the Save button is clicked, save changes to an existing record or insert a  new record into the General History table.  
    v. The screen should go back to “View” mode upon the click of the Save button.  The Close button should close the screen and go back to the patient selection  
screen. 
  b. The following specific frames must also have a button to start the automated interview:
    i. General Medical History form as a button to start the automated interview for  specific general medical history data (see General Medical History table). 
  c. The GUI must be structured to include: 
    i. A patient selection form which upon selection of a patient takes you to a patient  demographics form. 
    ii. The patient demographics form must have buttons to go to a: 
        1. General Medical History form. 
4. Use a graph or binary tree structure to implement the interview. Each node must include a  question and depending on a YES/NO or TRUE/FALSE answer navigate to either the right or left  branch of the tree to ask the next question. Suggestion: You may want to create many binary  trees for specific interview subsets rather than one extremely large tree. For example, a tree  specific to getting general medical history data or specific trees for asking questions regarding  specific general medical history data such as blood type, another for specifically for questions on  alcohol consumption, etc. You will have a lot of flexibility on how to implement this tree(s) but  must show that the interview is driven by a binary tree(s). 
5. Save the interview results to the respective database tables. 
6. Database Table Fields 

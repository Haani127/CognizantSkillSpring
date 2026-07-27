##### **Step 1 : Navigate to the Git Repository**



C:\\Users\\Haani>cd /d D:\\clg\\placement\\gitassessment\\GitDemo





##### **Step 2 : Create a Log Folder**





D:\\clg\\placement\\gitassessment\\GitDemo>mkdir log





##### **Step 3 : Create a Log File Inside the Folder**



D:\\clg\\placement\\gitassessment\\GitDemo>echo This is a log file > log\\application.log





##### **Step 4 : Create a Log File in the Root Directory**



D:\\clg\\placement\\gitassessment\\GitDemo>echo Root log file > error.log





##### **Step 5 : Create a .gitignore File**



**D:\\clg\\placement\\gitassessment\\GitDemo>notepad .gitignore**



##### **Step 6 : Verify Ignored Files**





D:\\clg\\placement\\gitassessment\\GitDemo>git status



On branch main

Untracked files:

&#x20; (use "git add <file>..." to include in what will be committed)

&#x20;       .gitignore

&#x20;       config



nothing added to commit but untracked files present (use "git add" to track)





##### **Step 7 : Stage the .gitignore File**



D:\\clg\\placement\\gitassessment\\GitDemo>git add .gitignore





##### **Step 8 : Commit the Changes**



D:\\clg\\placement\\gitassessment\\GitDemo>git commit -m "Added .gitignore file"



##### **Step 9 : Push the Changes**



D:\\clg\\placement\\gitassessment\\GitDemo>git push



##### **Step 10 : Verify Repository Status**



D:\\clg\\placement\\gitassessment\\GitDemo>git status



On branch main

Untracked files:

&#x20; (use "git add <file>..." to include in what will be committed)

&#x20;       config



nothing added to commit but untracked files present (use "git add" to track)



###### Folder Structure



GitDemo

│── .git

│── .gitignore

│── welcome.txt

│── error.log        (Ignored)

└── log              (Ignored)

&#x20;   └── application.log



##### **Conclusion**



The .gitignore file successfully ignores all files with the .log extension and the log directory. These files are not tracked by Git and are excluded from commits.


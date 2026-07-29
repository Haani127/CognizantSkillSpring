##### Step 1: Verify main is clean



D:\\clg\\placement\\gitassessment\\GitDemo>git checkout main

Already on 'main'



D:\\clg\\placement\\gitassessment\\GitDemo>git status

On branch main

Untracked files:

&#x20; (use "git add <file>..." to include in what will be committed)

&#x20;       config



nothing added to commit but untracked files present (use "git add" to track)

##### 

##### 

##### Step 2: Create branch GitWork and add hello.xml



D:\\clg\\placement\\gitassessment\\GitDemo>git checkout -b GitWork

Switched to a new branch 'GitWork'



D:\\clg\\placement\\gitassessment\\GitDemo>echo "<message>Hello from GitWork</message>" > hello.xml

##### 

##### 

##### Step 3: Update hello.xml

##### 

D:\\clg\\placement\\gitassessment\\GitDemo>echo "<message>Hello from GitWork - Updated</message>" > hello.xml

##### 

##### Step 4: Commit the changes

##### 

D:\\clg\\placement\\gitassessment\\GitDemo>git add hello.xml



D:\\clg\\placement\\gitassessment\\GitDemo>git commit -m "Added hello.xml in GitWork"

\[GitWork 82c0438] Added hello.xml in GitWork

&#x20;1 file changed, 1 insertion(+)

&#x20;create mode 100644 hello.xml

##### 

##### Step 5: Switch to main

##### 

##### 

D:\\clg\\placement\\gitassessment\\GitDemo>git checkout main

Switched to branch 'main'

##### 

##### Step 6: Add hello.xml with different content



D:\\clg\\placement\\gitassessment\\GitDemo>echo "<message>Hello from Master</message>" > hello.xml

##### 

##### Step 7: Commit on main

##### 

D:\\clg\\placement\\gitassessment\\GitDemo>git add hello.xml



D:\\clg\\placement\\gitassessment\\GitDemo>git commit -m "Added hello.xml in master"

\[main 7dd7e80] Added hello.xml in master

&#x20;1 file changed, 1 insertion(+)

&#x20;create mode 100644 hello.xml

##### 

##### Step 8: View log

##### 

##### 

D:\\clg\\placement\\gitassessment\\GitDemo>git log --oneline --graph --decorate --all

\* 7dd7e80 (HEAD -> main) Added hello.xml in master

| \* 82c0438 (GitWork) Added hello.xml in GitWork

|/

\* a91339e (origin/main) Added branch.txt in GitNewBranch

\* d72207a Added .gitignore file

\* 087a0e2 Initial commit

##### 

##### Step 9: Check differences

##### 



D:\\clg\\placement\\gitassessment\\GitDemo>git diff main GitWork

diff --git a/hello.xml b/hello.xml

index f4a2c58..4e42cd0 100644

\--- a/hello.xml

+++ b/hello.xml

@@ -1 +1 @@

\-"<message>Hello from Master</message>"

+"<message>Hello from GitWork - Updated</message>"

##### 

##### 

##### Step 10: Merge the branch

##### 

D:\\clg\\placement\\gitassessment\\GitDemo>git merge GitWork

Auto-merging hello.xml

CONFLICT (add/add): Merge conflict in hello.xml

Automatic merge failed; fix conflicts and then commit the result.

##### 

##### 

##### Step 11: Observe Git markup

##### 

D:\\clg\\placement\\gitassessment\\GitDemo>notepad hello.xml



##### Step 12: Resolve the conflict



<message>Hello from Master and GitWork</message>

##### 

##### Step 13: Commit the resolved merge



D:\\clg\\placement\\gitassessment\\GitDemo>git add hello.xml



D:\\clg\\placement\\gitassessment\\GitDemo>git commit -m "Resolved merge conflict"

\[main cd08238] Resolved merge conflict



##### 

##### Step 14: Check status and ignore backup files



D:\\clg\\placement\\gitassessment\\GitDemo>git status

On branch main

Untracked files:

&#x20; (use "git add <file>..." to include in what will be committed)

&#x20;       config



nothing added to commit but untracked files present (use "git add" to track)

##### 

##### Step 15: Commit .gitignore



D:\\clg\\placement\\gitassessment\\GitDemo>git add .gitignore



D:\\clg\\placement\\gitassessment\\GitDemo>git commit -m "Added backup files to gitignore"

On branch main

Untracked files:

&#x20; (use "git add <file>..." to include in what will be committed)

&#x20;       config



nothing added to commit but untracked files present (use "git add" to track)

##### 

##### Step 16: List branches





D:\\clg\\placement\\gitassessment\\GitDemo>git branch

&#x20; GitWork

\* main



##### 

##### Step 17: Delete merged branch



D:\\clg\\placement\\gitassessment\\GitDemo>git branch -d GitWork

Deleted branch GitWork (was 82c0438).

##### 

##### Step 18: View final log



D:\\clg\\placement\\gitassessment\\GitDemo>git log --oneline --graph --decorate

\*   cd08238 (HEAD -> main) Resolved merge conflict

|\\

| \* 82c0438 Added hello.xml in GitWork

\* | 7dd7e80 Added hello.xml in master

|/

\* a91339e (origin/main) Added branch.txt in GitNewBranch

\* d72207a Added .gitignore file

\* 087a0e2 Initial commit



##### 




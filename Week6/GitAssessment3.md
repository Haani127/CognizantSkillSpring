##### **Step 1: Navigate to the repository**



C:\\Users\\Haani>cd /d D:\\clg\\placement\\gitassessment\\GitDemo



##### **Step 2: Create a new branch and verify**



**D:\\clg\\placement\\gitassessment\\GitDemo>git branch GitNewBranch**



**D:\\clg\\placement\\gitassessment\\GitDemo>git branch GitNewBranch**



**D:\\clg\\placement\\gitassessment\\GitDemo>git branch**

&#x20; **GitNewBranch**

**\* main**



##### **Step 3: List all local and remote branches**



**D:\\clg\\placement\\gitassessment\\GitDemo>git branch**

&#x20; **GitNewBranch**

**\* main**



**D:\\clg\\placement\\gitassessment\\GitDemo>git branch -r**

&#x20; **origin/main**



**D:\\clg\\placement\\gitassessment\\GitDemo>git branch -a**

&#x20; **GitNewBranch**

**\* main**

&#x20; **remotes/origin/main**



**D:\\clg\\placement\\gitassessment\\GitDemo>**



##### **Step 4: Switch to the new branch**



**D:\\clg\\placement\\gitassessment\\GitDemo>git checkout GitNewBranch**

**Switched to branch 'GitNewBranch'**



**D:\\clg\\placement\\gitassessment\\GitDemo>git branch**

**\* GitNewBranch**

&#x20; **main**



##### **Step 5: Create a new file**



**D:\\clg\\placement\\gitassessment\\GitDemo>echo This file is created in GitNewBranch > branch.txt**



##### **Step 6: Check status**



**D:\\clg\\placement\\gitassessment\\GitDemo>git status**

**On branch GitNewBranch**

**Untracked files:**

&#x20; **(use "git add <file>..." to include in what will be committed)**

&#x20;       **branch.txt**

&#x20;       **config**



**nothing added to commit but untracked files present (use "git add" to track)**



##### **Step 7: Stage the file**



**D:\\clg\\placement\\gitassessment\\GitDemo>git add branch.txt**





##### **Step 8: Commit**



**D:\\clg\\placement\\gitassessment\\GitDemo>git commit -m "Added branch.txt in GitNewBranch"**



**\[GitNewBranch a91339e] Added branch.txt in GitNewBranch**

&#x20;**1 file changed, 1 insertion(+)**

&#x20;**create mode 100644 branch.txt**



##### **Step 9: Verify status**



**D:\\clg\\placement\\gitassessment\\GitDemo>git status**



**On branch GitNewBranch**

**Untracked files:**

&#x20; **(use "git add <file>..." to include in what will be committed)**

&#x20;       **config**



**nothing added to commit but untracked files present (use "git add" to track)**





##### **Step 10: Switch back to main**



**D:\\clg\\placement\\gitassessment\\GitDemo>git checkout main**



**Switched to branch 'main'**



##### 

##### **Step 11: View differences**



##### 

**D:\\clg\\placement\\gitassessment\\GitDemo>git diff main GitNewBranch**



**diff --git a/branch.txt b/branch.txt**

**new file mode 100644**

**index 0000000..319a3b0**

**--- /dev/null**

**+++ b/branch.txt**

**@@ -0,0 +1 @@**

**+This file is created in GitNewBranch**

##### 

##### **Step 12: Merge the branch**



**D:\\clg\\placement\\gitassessment\\GitDemo>git merge GitNewBranch**



**Updating d72207a..a91339e**

**Fast-forward**

&#x20;**branch.txt | 1 +**

&#x20;**1 file changed, 1 insertion(+)**

&#x20;**create mode 100644 branch.txt**



##### **Step 13: View commit history**



**D:\\clg\\placement\\gitassessment\\GitDemo>git log --oneline --graph --decorate**



**\* a91339e (HEAD -> main, GitNewBranch) Added branch.txt in GitNewBranch**

**\* d72207a Added .gitignore file**

**\* 087a0e2 (origin/main) Initial commit**

##### 

##### **Step 14: Delete the merged branch**



**D:\\clg\\placement\\gitassessment\\GitDemo>git branch -d GitNewBranch**



**Deleted branch GitNewBranch (was a91339e).**

##### 

##### **Step 15: Check status**



**D:\\clg\\placement\\gitassessment\\GitDemo>git status**



**On branch main**

**Untracked files:**

&#x20; **(use "git add <file>..." to include in what will be committed)**

&#x20;       **config**



**nothing added to commit but untracked files present (use "git add" to track)**

##### 

##### **Step 16: Push to GitLab (optional but recommended)**



**D:\\clg\\placement\\gitassessment\\GitDemo>git push origin main**



**Enumerating objects: 7, done.**

**Counting objects: 100% (7/7), done.**

**Delta compression using up to 16 threads**

**Compressing objects: 100% (4/4), done.**

**Writing objects: 100% (6/6), 573 bytes | 143.00 KiB/s, done.**

**Total 6 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)**

**To ssh://altssh.gitlab.com:443/haani127/gitdemo.git**

&#x20;  **087a0e2..a91339e  main -> main**






































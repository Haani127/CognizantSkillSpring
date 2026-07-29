##### Step 1: Verify main is in a clean state



D:\\clg\\placement\\gitassessment\\GitDemo>git checkout main

Already on 'main'



D:\\clg\\placement\\gitassessment\\GitDemo>git status

On branch main

Untracked files:

&#x20; (use "git add <file>..." to include in what will be committed)

&#x20;       config



nothing added to commit but untracked files present (use "git add" to track)





##### Step 2: List all available branches



D:\\clg\\placement\\gitassessment\\GitDemo>git branch

\* main







##### Step 3: Pull the remote repository



D:\\clg\\placement\\gitassessment\\GitDemo>git pull origin main

From ssh://altssh.gitlab.com:443/haani127/gitdemo

&#x20;\* branch            main       -> FETCH\_HEAD

Already up to date.





##### Step 4: Push pending changes



D:\\clg\\placement\\gitassessment\\GitDemo>git push origin main



Enumerating objects: 10, done.

Counting objects: 100% (10/10), done.

Delta compression using up to 16 threads

Compressing objects: 100% (7/7), done.

Writing objects: 100% (9/9), 847 bytes | 141.00 KiB/s, done.

Total 9 (delta 4), reused 0 (delta 0), pack-reused 0 (from 0)

To ssh://altssh.gitlab.com:443/haani127/gitdemo.git

&#x20;  a91339e..cd08238  main -> main



##### Step 5: Verify changes on GitLab


https://github.com/Haani127/CognizantSkillSpring/blob/main/Week6/gitassessment5_verification.png





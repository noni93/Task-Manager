Group Project Design
======================

Introduction
---------------------
Due to increase in the complexity of projects, it has become increasingly important for today’s corporations to optimize their workload and available resources to effectively achieve their project goals. The goal of our project is to create a task management web application for corporations to manage their projects, meet deadlines, track their progress on approved projects, prioritize their projects to effectively use available resources and budget or time to complete their projects, share feedback on projects and associated tasks.  The main user of this web application will be ultimately corporations with distributed and dynamic usage of this web app across different teams within those corporations . This web app will allow the employees to propose certain task with its priority, start and estimated stop dates, description, and much more attributes, which then will be approved and assigned appropriately by managers. This web app will allow all users to track their progress on their respective projects as well as team and the whole corporation projects. All team members on this project have been divided to solve certain problems about this application and then finally coming together to combine all optimized solutions to build this application. The teamwork and the passion to solve real world problem are two most important factors that motivate us to solve this problem using software engineering principles and best practices and ultimately improve our problem-solving skills.

Product Review
---------------
***Recorder (Android app)***
* Purpose: to record sounds, contains option for recording sound in different environment
    - normal, meeting, interview, concert mode setting
* View: simple user interface with 3 main sections
    - 3 bottons start, save, and recordings to look at old saved files
    - displays running time and sound activity
* Saved File: displayed as blockes that contains file name, date recorded, and length of recording.
* Relation to Project: ideas for designing a simple interface

***Github (web page)***
* Purpose: file host for people working together
* Github keeps track of user activity, repositories created and contributed to, and teams user are in.
* contains access rights (private and public repositories)
* branching, merging, and commit functions

***Google Calendar (web/app)***
* Purpose: calendar to keep track of events
* View: contains day, week, month, and year view of calendar
* Functions: allows user to add events to calendar, keeps track of time on user device
    - events can be given name and description
    - allows user to set event duration (start date and end date)
    - allows user to set reminders, birthdays, and holidays

Project Overview
----------------
Taking into consideration the functionality of the google calendar app and a task managing app, it would be great for employees in a company to have a task managing system like the google calendar. They would have similar functions like the google calendar as well as a task timing functions to help manage their work.  

* Task organizer for the average employee.
* Three accounts associated with this prodcut; manager, employee, and dev account
* Manager can use this product to manage employee productivity.
* Employees can use this product for time management.



Project Architecture
--------------------
Considering the experience levels of all team members and reviewing other task management products, we as a team have decided to use REST Representational state transfer architectural style. We have decided to implement web application with front-end and back-end components. We believe that implementing this architectural style, we will be able to separate the user interface/user interaction(Front-End) and the model/logic (Back-End). We will also integrate and practice MVC style in this application. Technologies that we are planning to use Java Spring MVC, JSP, and Hibernate for the backend development, allowing us to effectively integrate MVC style with REST. We are also planning to use RESTFul Apis to accomplish some of our tasks (not decided which ones yet). We are planning to use SQL Database controlled by Hibernate for our backend. We are also planning to use HTML, CSS, and JavaScript and JS frameworks for the front end development.  
Front-end side will have user interactions components such as dashboard, login and logout system, admin system to manage tasks, etc based upon the user type i.e. employee, manager, or dev. For the database, we are going to model how are we going to store out data, separating users table, task table with rows as task and columns as different attributes of a certain task. Finally, we base these architectural decisions based on thorough evaluation of our skill level and experiences.  



Requirements
------------
 
Requirements | Description
-------------|------------
REQ1         | Application should generate dynamic dashboards based on the role of the person who logged in with valid credentials. For example, Manager should have admin dashboard for the tasks his/her team is working on
REQ2         | Application should allow Employees o propose the task to the manager and their teams with attributes such as start time, estimated stop time, description, priorities, etc
REQ3         |Application should enable summarizing the tasks, altering summaries for users with different roles
REQ4         |Application must validate credentials when login and must validate that certain actions are executed based on the rights of the user. For example, only manager can approve or disapprove tasks as they have admin rights.
REQ5         |Application should have different tabs for different functions like user dashboard may have tab named “Completed” which shows all completed tasks so far.
REQ6         |Application should allow employees to generate the task reports for any time period whenever needed. For example, when manager suddenly asks for the report of the progress on tasks
REQ7         |Application should allow users to prioritize tasks
REQ8         |Application should allow users to propose an estimated end date for certain task so other users on the team can trace any given task and frame their efforts that way.
REQ9         |Application should allow different users to feedback other tasks if they have access to those tasks
REQ10        |Application should allow managers to assign new task or reassign task to someone else in the team
REQ11        |Application should allow users to create and view history in form of the threads containing who worked on a given task and how and when he/she worked on it.
REQ12        |Application should allow employees to change the task attribute without any restrictions if that task has not been approved
REQ13        |Application should provide alternatives to overcome some restrictions if they are needed to.For example, if someone wants to change something about a task after it’s approved by manager then he or she must get permission from the manager to modify that task
REQ14		 |Application should be able to generate summaries for all type of tasks,i.e., in progress tasks, completed tasks, and pending tasks.
REQ15        |Application should allow the successful logout.
REQ16        |Application should have timeline feature which allows users to manage their pace on tasks in progress
REQ17        |Application should display different visualizations like graphs representing the amount of completion of a certain task. 
REQ 18       |Application should allow dynamic registration criteria for corporations which can then distribute the usage of this app to teams where managers are generally admins and employees are users
REQ 19       |Application should give managers enough admin rights, such as changing due dates, deleting tasks, updating tasks, updating priorities, etc.
REQ20        |Application should allow shared working environment where users in a given team can track all tasks of that team, chat with each other, provide feedback, etc.


### Use Cases  
____

| Use Case #1 | Start Task |
|--|--|
| Requirements | Req1,Req4 |
| Initiating Actor | User/Admin |
| Actor's Goal | Start specified task with required specifications |
| Participating Actors | Database, user |
| Preconditions | User sees button named "Start Task" on main page of website (after login) |
| Postconditions | Start through GUI |
| Flow of events | --> User hits button |
|  | <-- Database finds related task and runs start() |


| Use Case #2 | Stop Task |
|--|--|
| Requirements | Req1,Req4 |
| Initiating Actor | User/Admin |
| Actor's Goal | Finish specified task with required specifications |
| Participating Actors | Database, user |
| Preconditions | User sees button named "Stop Task" on main page of website (after login) |
| Postconditions | stop task through GUI |
| Flow of events | --> User hits button |
|  | <-- Database finds related task and runs stop() |


| Use Case #3 | Edit Task |
|--|--|
| Requirements | Req6,Req5,Req9 |
| Initiating Actor | Admin |
| Actor's Goal | Edit specified task (any of the items within task) |
| Participating Actors | Database, user |
| Preconditions | Admin sees list of items on their page with corresponding "edit" button |
| Postconditions | edit task through GUI |
| Flow of events | --> admin hits button |
|  | <-- Database finds related task and runs edit(specified object) |
|  | --> data is changed and displayed |


| Use Case #4 | Add Estimated Time |
|--|--|
| Requirements | Req6,Req14,Req17 |
| Initiating Actor | User |
| Actor's Goal | Add estimated time of completion for task (seen by admin) |
| Participating Actors | Database, user, admin |
| Preconditions | User types in entry box to specify time |
| Postconditions | Reflected on GUI |
| Flow of events | --> User edits text in box |
|  | <-- Database finds related task and runs edit(estimated time) |
|  | --> data is changed and displayed |


| Use Case #5 | Assign Task |
|--|--|
| Requirements | Req6,Req14,Req17,Req11,Req12,Req1 |
| Initiating Actor | Admin |
| Actor's Goal | Assign task to specific user |
| Participating Actors | Database, user, admin |
| Preconditions | Admin clicks "assign" button |
| Postconditions | Reflected on GUI |
| Flow of events | --> admin adds user to box and clicks "assign" |
|  | <-- Database finds related user and runs assign(user) |
|  | --> data is changed and displayed |


| Use Case # | Create Account/Login |
|--|--|
| Requirements | Req1,Req4 |
| Initiating Actor | Manager,Employee |
| Actor's Goal | Creates account, and Login into the account with valid credentials |
| Participating Actors | Database |
| Preconditions | Valid employee/manager username  and password|
| Postconditions | Use task manager as desired |  

 Flow of events   
 1.--> Program launches  
 2.<-- Username and password required    
 3.--> User enters credentials  
 4.<-- if valid credential, then user able to use task Manager  
 
 | Use Case # | summary |
|--|--|
| Requirements | Req3,Req8, Req11, Req14 |
| Initiating Actor | Manager,Employee |
| Actor's Goal | Get the summary for whole tasks or specific task |
| Participating Actors | Database |
| Preconditions | task should exist in database|
| Postconditions | provides name, description, size, running time for the task |   

 Flow of events   
 1.<-- User selects summary.  
 2.--> Program returns required/available information for task. 
 
  | Use Case # | Task Priority |
|--|--|
| Requirements | Req2,Req7, Req19 |
| Initiating Actor | Employee |
| Actor's Goal | Work on the task that has higher priority|
| Participating Actors | Database, Manager |
| Preconditions | task should exist in database, and priority to be provided by manager|
| Postconditions | employee gets the priority about certain task |   

 Flow of events   
 1.<-- User selects task priority.    
 2.--> Program returns priority for task if set by manager.  


#### Requirements-to-use-cases traceability matrix
|Requirements	|	Priority| UC1 | UC2 | UC3 | UC4 | UC5 | UC6| UC7| UC8| 
|---------------|---------------|-------|---|-|-|-|-|-|-
|REQ1 ||	|
|REQ2 || 	|
|REQ3 || 	|
|REQ4 || 	|
|REQ5 || 	|
|REQ6 || 	|
|REQ7 || 	|
|REQ8 || 	|
|REQ9 || 	|
|REQ10 || 	|
|REQ11 || 	|
|Max PW||	|
|Total PW|| |

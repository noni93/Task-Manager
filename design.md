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

The google calendar app reminds and also saves events for the user. It tracks time through the julian calendar as well as the current time on the users device. For daily usage the app is used to store reminders, birthdays, and holidays. Sometimes it is also used to plan events and organize one's social life. 

Project Overview
----------------
Taking into consideration the functionality of the google calendar app and a task managing app, it would be great for employees in a company to have a task managing system like the google calendar. They would have similar functions like the google calendar as well as a task timing functions to help manage their work.  

* Task organizer for the average employee.
* Three accounts associated with this prodcut; manager, employee, and dev account
* Manager can use this product to manage employee productivity.
* Employees can use this product for time management.

Project Architecture
--------------------
Considering the experience levels of all team members and reviewing other task management products, we as a team have decided to use REST Representational state transfer architectural style. We have decided to implement web application with front-end and back-end components. We believe that implementing this architectural style, we will be able to separate the user interface/user interaction(Front-End) and the model/logic (Back-End). We will also integrate and practice MVC style in this application. Technologies that we are planning to use Java Spring MVC, JSP, and Hibernate for the backend development, allowing us to effectively integrate MVC style with REST. We are also planning to use RESTFul Apis to accomplish some of our tasks (not decided which ones yet). We are planning to use SQL Database controlled by Hibernate for our backend. We are also planning to use HTML, CSS, and JavaScript and JS frameworks for the front end development.  Front-end side will have user interactions components such as dashboard, login and logout system, admin system to manage tasks, etc.  For the database, we are going to model how are we going to store out data, separating users table, task table with rows as task and columns as different attributes of a certain task. Finally, we base these architectural decisions based on thorough evaluation of our skill level and experiences.  



Requirements
------------

Use Cases
-----------

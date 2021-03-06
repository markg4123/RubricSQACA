# <center> **Demonstrating Software Quality** </center>
## <center>  Author: Mark Grogan - C17399611 </center>
<p align = "center">
  <img width="900" height="300" src="https://reqtest.com/wp-content/uploads/2019/02/965-X-365-resized-1-731x276.jpg">
</p>

---
## <center>  Table of Contents </center>
---


 * Scrum Sprint Backlog


* Task Estimation
  - Three-point Estimation
  - Velocity Metric

* Team Version Control
  - Branches

* Test Coverage
  - EclEmma

* Code Review
  - What is a Code review?
  - Why do a code review?
  - Pull requests
  - Code Review Checklist for Pull Requests

* Test Driven Development

<br>


---
## Scrum Sprint Backlog 
---
<br>

| Story                                         | Estimation  | Priority |
| :---                                          |    :----:   |  :----:  |
|Create a new Rubric                            | 1           |  1       |
|Add a Criterion to a Rubric                    | 3           |  2       |
|Get a list of all Rubrics                      | 2           |  3       |
|Get a specific Rubric by name                  | 4           |  4       |
|Create a new StudentGrade                      | 2           |  5       |
|Add score for criterion to a grade             | 3           |  6       |
|Get all StudentGrades associated with a Rubric | 4           |  7       |
|Calculate Average                              | 2           |  8       |
|Calculate Standard Deviation                   | 4           |  9       |
|Define Min and Max Score                       | 2           |  10      |
|Generate Summary                               | 2           |  11      |
|Total                                          | 29                     |

<br>

---
##  Task Estimation
---

Task Estimations can allow a Team to determine how much work they should bring into a Sprint. This can allow a team to adjust, correct course, get features and their product to the end-user more quickly. This can lead to a project been delivery on time and not going overbudget. It can also help a Team to stay focused as some work well under time constraints which can enhance the learning ability of the developers.



##  Three-point Estimation

<p align = "center">
  <img width="900" height="400" src="https://miro.medium.com/max/945/1*B7zN4-QgbdIH3IseXykfSw.png">
</p>

<br>
I used three-point estimate as I found that it is the most effective way to estimate tasks in scrum when doing so alone. With three-point estimate, I have three values, 1. The most likely value, 2. The optimistic value and 3. The pessimistic value.To calculate the actual estimate, I add the three values defined above and simply divide by 3. This gives me the most accurate task estimation value.
<br>

<br>
As seen in the Sprint Backlog above, Creating a new Rubric is given a estimation value of 1. Creating a new Rubric is relatively basic and will not require a lot of time to code. Alternatively, calculating the standard deviation is more of a complicated process and will take more time to code. Therefore it is given an estimation value of 4.
<br>


##  Velocity Metric

The Velocity Metric is calculated by adding up all the estimations for all fully completed tasks at the end of the Sprint. Knowing the velocity of a sprint allows me to know how many sprints it will take to achieve a desired level of functionality.
<br>
<br>

---
## Team Version Control
---
<p align = "center">
  <img width="900" height="400" src="https://i0.wp.com/build5nines.com/wp-content/uploads/2018/01/simplified-git-flow.png?resize=1024%2C354&ssl=1">
</p>


## Branches

- main
- develop
- sprint_backlog
- task_estimation
- team_version_control
- test_coverage
- test_driven_development
- code_review

<br>
Above is a list of the branches I created for this project. Spintbacklog_taskestimation contains a backlog of tasks and estimations of how long they will take to complete. Team_version_control contains a description of the branches used and how they fit in GitFlow. Test_coverage defines the test coverage tool I used and how I used it. Test_driven_development describes the commits made to my repository. Code_review contains a checklist of things that I should check when reviewing a Pull Request.
<br>

<br>
 The following branches: sprintbacklog_taskestimation, team_version_control, test_coverage, test_driven_development, code_review are merged into the develop branch. After review, the develop branch will finally be merged to the main branch as one README.md file.
<br>

---
## Test Coverage
---

<p align = "center">
  <img width="900" height="350" src="https://devonblog.com/wp-content/uploads/2017/05/code-coverage.png">
</p>

<br>
When writing unit tests, using a test coverage tool is very important. A test coverage tool will monitor the execution of your test suite and tell you how many of the statements, branches, functions and lines were run as part of your tests. This highlights the parts of your software you may not have tested.
<br>


## EclEmma

For this assignment the coverage tool I used was EclEmma. EclEmma is a java code coverage tool for Eclipse, available from the Eclipse marketplace. 
<p align = "left">
  <img width="300" height="450" src="picture2.png">
</p>

EclEmma is simple to set up and does not require any modifications to your project. Once downloaded the tool runs from eclipse. From the menu inside the IDE click Run and from the drop down menu and choose Coverage. The tool will then analyse your code and return information on what has been tested and what has not been tested. The results are immediately summarized and highlighted in your source code editors. See example below.

<p align = "left">
  <img width="800" height="450" src="picture1.png">
</p>


 EclEmma brings the code coverage analysis directly into your Eclipse workbench. It is straight forward to use and is accurate and effective.


---
## Code Review
---
<p align = "center">
  <img width="900" height="450" src="https://i.imgur.com/3JVclYV.png">
</p>

## What is a Code review?


Code review, also known as Peer Code Review, is a systematic examination of software code. The intention is to find bugs and improve software quality. Code review allows team members maintain a consistency between design and implementation techniques.


## Why do a Code review?


- Consistent design and implementation.
- Minimizing mistakes and their impact.
- Ensuring project quality and meeting requirements.



## Pull Requests


<p align = "center">
  <img width="900" height="400" src="Picture4.png">
</p>


In this assignment, I am working individually and accept my own pull requests. After a pull request is created, I will approve it, if there is no more work to be done on it by commenting my approval on the request. The branches can then be merged.

<p align = "center">
  <img width="900" height="400" src="https://i.imgur.com/CQWy3og.png">
</p>


## Code Review Checklist for Pull Requests


- Check for bad practices in the code.
- Analyse the impact of the changes being made.
- Ensure there is a high level of readability.
- Make sure there is consistent design and implementation.
- Ensure the quality is high and the code is meeting the requirements.
- Ensure there is correct spelling and grammar as markdown has no spellcheck. 


<br>
The above is the checklist I used for this assignment when approving pull requests. I found this worked well and minimised errors. Code review is an essential aspect of any software project and should always be carried out correctly. 
<br>

---
## Test Driven Development
---
<p align = "center">
  <img width="600" height="400" src="https://miro.medium.com/max/1126/1*UcGzy1kcqcI4ZG-NsXMxjA.png">


When creating tests for the software in this assignment, I created a test for each commit I made. Essentially, I had a test for each User Story.

Unit testing makes sure that all code meets quality standards. Over the course of the product development life cycle, unit testing saves time and money, and helps developers write better code, more efficiently.

<p align = "center">
  <img width="900" height="400" src="Picture5.png">

  Above is an example of one of the tests I created to test the creation of a Rubric. A Rubric is a list of Criteria. I created this when I wrote the code to create a Rubric. 

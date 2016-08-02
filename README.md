# SurveyRabbitApplication
Backend for a new web-based survey tool called Survey  Rabbit. When users login, they have two options:  (1) Users with author privileges can create a new survey or edit an existing one;  (2) Users with grader or author privileges can click on a survey answer the questions.  When authors create or edit a survey, they’re presented a Composer Mode UI where  they’re able to specify the survey title and create a sequence of questions using either  radio button or checkbox widgets. Each widget has a caption and a comma-separated  lists of possible responses, as sketched out below.  When graders respond to a survey, the Survey Rabbit client presents the questions, and  saves the answers to the database when the user clicks “Save.”

To get this project up and running:
1. git clone https://github.com/priyakot/SurveyRabbitApplication.git
2. cd SurveyRabbitApplication
3. Use the gradle wrapper to build: ./gradlew build
4. Start the application: java -jar build/libs/gs-rest-service-0.1.0.jar
5. Open your browser and go to the localhost url: 
   eg REST API: http://localhost:8080/api/get_user
   You can also use curl for each API:
   eg.curl --request POST http://localhost:8080/api/get_user?userId=1234
   Sample Response: {"uid":1234,"userType":"admin","userName":"Priya"}
   These APIs are  parametrized. You can currently call them without parameters since they will take the default values.
   
   The APIS supported are listed in the SURVEY RABBBIT API DOCUMENTATION page
   

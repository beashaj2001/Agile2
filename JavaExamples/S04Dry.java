//Better solution is to keep SQL statements in an XML file. Read
//the XML file at the start of the application. Get the appropriate
//SQL statement from the SQL factory.

//Use PreparedStatement only if the SQL code is executed multiple times.
//Otherwise use Statement functions:
//     executeUpdate
//     executeQuery
//     executeBatch

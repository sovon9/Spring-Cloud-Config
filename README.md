# Spring-Cloud-Config
simple application to test spring cloud centralized config feature

keep config files in F drive configs location as <b>F:\configs\<service name>\<profile>\<lable></b>
For example if client service is SpringConfigClient then 
F:\configs\SpringConfigClient\prod\1.0.0\SpringConfigClient-prod.properties

# For testing from postman

''' 
curl --location 'http://localhost:8763/SpringConfigClient/prod/1.0.0' \
--header 'Authorization: Basic Y29uZmlnVXNlcjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=B93443A0F8E0CE88CEE6454DC3D9646F'
''' 

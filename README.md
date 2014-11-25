Twitter Connector DEMO
======================================================
This is a simple demo, that polls tweets every 10 secs from your personal timeline, and analysis the source device of the tweets, and make a summary of how many time each device was use and tweets the result back to Twitter!

Setup and configuration
-----------------------

Download JBoss Fuse from jboss.org, and place the downloaded zip file under installs folder.

Add fabric server passwords for Maven Plugin to your ~/.m2/settings.xml file the fabric server's user and password so that the maven plugin can login to the fabric.

```
<server>
  <id>fabric8.upload.repo</id>
  <username>admin</username>
  <password>admin</password>
</server>
```
Goto project folder, under twitterdemo/src/resource, find the twitter.properties file, 
replace 4 mandatory parameters with the content from Twitter Deverloper site.
(See my blog for more detail: http://wei-meilin.blogspot.com/2014/11/jboss-fuse-connecting-to-twitter-and.html)
 
```
1. consumerKey - The consumer key
2. consumerSecret - The consumer secret 
3. accessToken - The access token
4. accessTokenSecret - The access token secret
```

run 
```
init.sh
```

It will setup JBoss Fuse, install fabric, build and deploy the profile. 


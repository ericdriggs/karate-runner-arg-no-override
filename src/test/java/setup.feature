@ignore
  Feature:

    Scenario:
      #If this variable is already defined, it will no longer be overwritten since karate 1.1.0.RC1
      * def foo = 'before'
      * print 'foo before: ' , foo
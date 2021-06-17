Feature: set variable using def and set

    Scenario: set variable th
      * def fooDef = 'barDef'
      * match fooDef == 'barDef'

      * def var1 = "set"
      * karate.set('foo_' + var1 , 'bar_set')

      * match foo_set == 'bar_set'


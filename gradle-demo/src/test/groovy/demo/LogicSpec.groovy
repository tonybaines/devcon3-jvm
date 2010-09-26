package demo

import spock.lang.Specification

class LogicSpec extends Specification {
  def logic = new Logic()

  def "NOT"() {
    expect:
      (logic.not(a)) == result
    where:
      a     | result
      true  | false
      false | true
  }
  
  def "aND"() {
    expect:
      (logic.and(a, b)) == result
    where:
      a     | b      | result
      true  | true   | true
      true  | false  | false
      false | true   | false
      false | false  | false
  }
  
  def "OR"() {
    expect:
      (logic.or(a,b)) == result
    where:
      a     | b      | result
      true  | true   | true
      true  | false  | true
      false | true   | true
      false | false  | false
  }

  def "XOR"() {
    expect:
      (logic.xor(a, b)) == result
    where:
      a     | b      | result
      true  | true   | false
      true  | false  | true
      false | true   | true
      false | false  | false
  }

}

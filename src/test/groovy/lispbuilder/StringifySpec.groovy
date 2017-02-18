package lispbuilder

import spock.lang.*
import static Functions.*

class StringifySpec extends Specification {

  def 'identifier stringifies to the provided value'() {
    expect:
    identifier('foo').toString() == 'foo'
  }

  def 'string stringifies with quotes'() {
    expect:
    string('foo').toString() == '"foo"'
  }

  def 'keyword prepends : to value'() {
    expect:
    keyword('foo').toString() == ':foo'
  }
  def 'empty list returns () as string'() {
    expect:
    list().toString() == '()'
  }

  def 'list function creates proper list'() {
    expect:
    list(identifier("a"), identifier("b")).toString() ==
      '(a b)'
  }

  def 'Lists stringify as expected depending on propriety'() {
    expect:
    input.toString() == expected

    where:
    [input, expected] << [
      [cons(identifier('a'), identifier('b')),
       '(a . b)'],
      [cons(identifier('a'), list()),
       '(a)'],
      [cons(identifier('a'),
            cons(identifier('b'), list())),
       '(a b)'],
      [cons(identifier('a'),
                cons(identifier('b'), identifier('c'))),
       '(a b . c)'],
      [cons(cons(identifier('a'),
                 cons(identifier('b'), list())),
                cons(identifier('c'), identifier('d'))),
       '((a b) c . d)']
    ]
  }

}

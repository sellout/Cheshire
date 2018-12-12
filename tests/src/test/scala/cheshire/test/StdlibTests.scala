package cheshire.test

import cheshire.instances._
import cheshire.laws._

import scala.{Boolean, Int, Long}

import org.scalatest.FunSuite
import org.typelevel.discipline.scalatest.Discipline

class StdlibTests extends FunSuite with Discipline {
  checkAll("Boolean", (new CartesianSetLaws[Boolean]).rig)
  checkAll("Int",     (new CartesianSetLaws[Int]).commutativeRing)
  checkAll("Long",     (new CartesianSetLaws[Long]).commutativeRing)
}

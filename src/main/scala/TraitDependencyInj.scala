object TraitDependencyInj extends App{

}

trait TestDependencyInj{
  def testMockMethod();
}

abstract class MocTest{
  val testDependency :TestDependencyInj

}

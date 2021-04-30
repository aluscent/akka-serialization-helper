package org.virtuslab.akkasaferserializer

import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.{AnyWordSpec, AnyWordSpecLike}

class TestCompilerSpec extends AnyFlatSpecLike with Matchers {
  "Test compiler".can("compile good code") in {
    val code = "object Foo extends App { println(42 / 0) }"
    val out = TestCompiler.compileCode(code)
    out.length should be(0)
  }

  it should "raise error when code is invalid" in {
    val code = "object Foo extends App { println(42 / 0 +) }"
    val out = TestCompiler.compileCode(code)
    out.length should not be 0
  }
}

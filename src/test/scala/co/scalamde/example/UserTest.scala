package co.scalamde.example

import org.scalatest.FunSuite

import scala.util.{Failure, Success}

class UserTest extends FunSuite {

  test("Encuentra la edad del usuario 1") {
    val usr = UsuarioRepository.findById(1)
    val edad: Int = usr match{
      case Success(u) => u.edad
      case Failure(e) => 0
    }
    assert(edad === 32)
  }

  test("Encuentra el genero del usuario 2") {
    val usr = UsuarioRepository.findById(2)
    val genero: Option[String] = usr match{
      case Success(u) => u.genero
      case Failure(e) => None
    }
    assert(genero === None)
  }

  test("Encuentra el genero del usuario 3") {
    val usr = UsuarioRepository.findById(3)
    val genero: Option[String] = usr match{
      case Success(u) => u.genero
      case Failure(e) => None
    }
    assert(genero === None)
  }
}


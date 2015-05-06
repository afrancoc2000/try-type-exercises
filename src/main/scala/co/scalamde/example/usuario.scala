package co.scalamde.example

import scala.util.{Success, Failure, Try}

case class Usuario(id: Int,
                   nombre: String,
                   apellido: String,
                   edad: Int,
                   genero: Option[String])

object UsuarioRepository {
  private val usuarios = Map(
    1 -> Usuario(1, "Juan", "Perez", 32, Some("masculino")),
    2 -> Usuario(2, "María", "Perez", 30, None))
  def findById(id: Int): Try[Usuario] =
    usuarios.get(id).fold[Try[Usuario]]{
      Failure(new Exception("Usuario inexistente"))
    }{u=>
      Success(u)
    }
  def findAll = usuarios.values
}

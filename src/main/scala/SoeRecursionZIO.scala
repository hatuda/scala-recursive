import zio.{Task, ZIO, ZIOAppDefault}

case object SoeRecursionZIO extends ZIOAppDefault {

  private def factorial(n: Int): ZIO[Any, Throwable, BigInt] =
    if (n == 0)
      ZIO.succeed(1)
    else
      for {
        n2 <- factorial(n - 1)
      } yield n2 * n

  def run: ZIO[Any, Throwable, Unit] =
    for {
      result <- factorial(10000)
      _ <- ZIO.logInfo(s"Result is $result")
    } yield ()

}

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.get

fun main(args: Array<String>) {

    val app = Javalin.create().apply {
        port(7000)
    }.start()

    app.routes {
        get("/") { ctx ->
            ctx.render("/public/index.html")
        }
    }
}

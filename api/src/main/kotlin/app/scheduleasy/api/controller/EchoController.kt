package app.scheduleasy.api.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/echo")
class EchoController {
    @GetMapping
    fun echo(): ResponseEntity<String> = ResponseEntity.status(HttpStatus.OK)
        .body("This is an echo endpoint")
}

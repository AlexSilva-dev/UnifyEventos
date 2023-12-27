package br.com.unifyeventos.user.controllers

import br.com.unifyeventos.user.entities.User
import br.com.unifyeventos.user.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController @Autowired constructor(
    val userRepository: UserRepository?
) {

    @GetMapping("/users")
    fun getFindAllUsers(): MutableIterable<User>? {
        val iterable = userRepository?.findAll();
        return iterable;
    }

    @PostMapping("/user")
    fun postUser(@RequestBody user: User): User? {
        return this.userRepository?.save(user);
    }
}
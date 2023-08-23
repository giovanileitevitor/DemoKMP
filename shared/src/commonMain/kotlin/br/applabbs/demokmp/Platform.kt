package br.applabbs.demokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
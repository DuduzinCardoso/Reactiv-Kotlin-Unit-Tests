package projetotreinamento.reactive.test

import lombok.extern.slf4j.Slf4j
import org.junit.jupiter.api.Test
import org.reactivestreams.Subscription
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.test.StepVerifier
import java.time.Duration
import java.util.logging.Level
import java.util.logging.Logger


/**
 * Reactive Streams
 * 1. Asynchronous
 * 2. Non-Blocking
 * 3. Backpressure
 * Publisher <- (Subscribe) Subscriber
 * Subscription is created
 * Publisher (onSubscribe with the subscription) -> Subscriber
 * Subscription <- (Resquest N) Subscriber
 * Publisher -> (onNext) Subscriber
 * until:
 * 1. Publisher sends all the objects requested.
 * 2. Publisher sends all the objects it has. (onComplete) subscriber and subscription will be canceled
 * 3. There is an error. (onError) -> subscriber and subscription will be canceled
 */
@Slf4j
class MonoTest {

//    @Test
//     fun monoSubscriber() {
//        val logger = Logger.getLogger("a")
//        val Name = "Eduardo Cardoso"
//        val mono = Mono.just(Name)
//            .map { it -> throw java.lang.RuntimeException("Testing mono with error") }
//
//        mono.subscribe()
//        StepVerifier.create(mono)
//            .expectNext()
//            .verifyComplete()
//    }

//    @Test
//    fun monoSubscriberConsumer() {
//        val logger = Logger.getLogger(MonoTest::class.java.canonicalName)
//        val Name = "Eduardo Cardoso"
//        val mono = Mono.just(Name)
//            .map { s -> throw RuntimeException("testing mono with error") }
//
//                mono.subscribe({ t -> logger.log(Level.INFO, "TESTE ") },
//                    {t -> logger.log(Level.SEVERE, "NAME {}", t)});
//
//        StepVerifier.create(mono)
//            .expectErrorMatches(({ throwable -> throwable is RuntimeException }))
//            .verify();
//    }

//    @Test
//    fun monoSubscriberConsumerComplete() {
//        val logger = Logger.getLogger(MonoTest::class.java.canonicalName)
//        val Name = "Eduardo Cardoso"
//        val mono = Mono.just(Name)
//            .log()
//            .map(String::toUpperCase)
//
//        mono.subscribe({ t -> logger.log(Level.INFO, "Teste ${t}") },
//            Throwable::printStackTrace,
//            {logger.log(Level.INFO, "FInalizaado")},
//            Subscription::cancel)
//
//        StepVerifier.create(mono)
//            .expectNext(Name.toUpperCase())
//            .verifyComplete();
//    }

//    @Test
//    fun monoDoOnMethods(){
//        val logger = Logger.getLogger(MonoTest::class.java.canonicalName)
//        val name = "Eduardo Cardoso"
//        val mono = Mono.just(name)
//            .log()
//            .map(String::toUpperCase)
//            .doOnSubscribe{subscription -> logger.log(Level.INFO, "Subscribed")}
//            .doOnRequest{longNumber -> logger.log(Level.INFO, "Request Received, starting doing something...")}
//            .doOnNext { it -> logger.log(Level.INFO, "Value is here, Executing doOnNext ${it}") }
//            .flatMap{it -> Mono.empty<Void>()}
//            .doOnNext { it -> logger.log(Level.INFO, "Value is here, Executing doOnNext ${it}") }
//            .doOnSuccess { it -> logger.log(Level.INFO, "doOnSuccess executed ${it}")}
//
//        mono.subscribe({s -> logger.log(Level.INFO, "Value ${s}")},
//            Throwable::printStackTrace,
//            {logger.log(Level.INFO, "FINALIZADO")})
//    }

//    @Test
//    fun monoOnErrorReturn(){
//        val error = Mono.error<String>(IllegalArgumentException("Illegal argument exception"))
//            .onErrorReturn("EMPTY")
//            .log()
//
//        StepVerifier.create(error)
//            .expectNext("EMPTY")
//            .verifyComplete()
//    }

//    @Test
//    fun fluxSubscriberNumbers(){
//        val logger = Logger.getLogger(MonoTest::class.java.canonicalName)
//        val flux = Flux.range(1, 5)
//            .log()
//
//        flux.subscribe{it -> logger.log(Level.INFO, "Number ${it}")}
//
//        logger.log(Level.INFO,"---------------------------------------------------")
//        StepVerifier.create(flux)
//            .expectNext(1, 2 , 3, 4, 5)
//            .verifyComplete()
//    }

//    @Test
//    fun fluxSubscriberStrings(){
//        val logger = Logger.getLogger(MonoTest::class.java.canonicalName)
//        val fluxString = Flux.just("Megumin", "Eduardo", "Louise", "Camille")
//            .log()
//
//        fluxString.subscribe{it -> logger.log(Level.INFO, "Names: ${it}")}
//
//        logger.log(Level.INFO, "----------------------------------------------------- -")
//        StepVerifier.create(fluxString)
//            .expectNext("Megumin", "Eduardo", "Louise", "Camille")
//            .verifyComplete()
//    }

//    @Test
//    fun fluxSubscriberFromList(){
//        val logger = Logger.getLogger(MonoTest::class.java.canonicalName)
//        val fluxList = Flux.fromIterable(listOf(1, 2, 3, 4, 5))
//            .log()
//
//        fluxList.subscribe { it -> logger.log(Level.INFO, "Number ${it}")}
//
//        logger.log(Level.INFO, "-------------------------------------------------------")
//        StepVerifier.create(fluxList)
//            .expectNext(1, 2, 3, 4, 5)
//            .verifyComplete()
//    }

//    @Test
//    fun test2(){
//        val fluxAutoConnect = Flux.range(1,5)
//            .log()
//            .delayElements(Duration.ofMillis(100))
//            .publish()
//            .autoConnect(2)
//
//        StepVerifier
//            .create(fluxAutoConnect)
//            .then(fluxAutoConnect::subscribe)
//            .expectNext(1,2,3,4,5)
//            .expectComplete()
//            .verify()
//    }
}
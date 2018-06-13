package mastering.kotlin.performance.chapter9

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import java.math.BigInteger

class Baker {

    fun bake(): Cake {
        for (i in 0..1_000_000_000) {
            BigInteger.ONE.modPow(BigInteger.TEN, BigInteger.TEN)
        }
        return Cake()
    }

    fun singleBake(): Single<Cake> {
        return Single.fromCallable { bake() }.subscribeOn(Schedulers.computation())
    }

}
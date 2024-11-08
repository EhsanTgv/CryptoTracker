package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.utils.NetworkError
import com.plcoding.cryptotracker.core.domain.utils.Result
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime,
    ): Result<List<CoinPrice>, NetworkError>
}
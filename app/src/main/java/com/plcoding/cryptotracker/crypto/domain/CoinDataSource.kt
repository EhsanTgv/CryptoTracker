package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.utils.NetworkError
import com.plcoding.cryptotracker.core.domain.utils.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}
package com.official.cufitapi.domain.api

import com.official.cufitapi.domain.application.ConnectionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@ApiV1Controller
class ConnectionApiController(
    private val connectionService: ConnectionService
) {

    // 연결 정보확인
    @GetMapping("/connections")
    fun getConnection(
        memberId: Long
    ) {

    }

    // 연결 요청
    // - 본인의 후보자 중 1명을 선택해서 연결 요청을 보낼 수 있음.
    //    - 후보자 1명당 1일 최대 3명까지 연결 요청을 보낼 수 있음.
    // 같은 성별에게는 연결 요청을 보낼 수 없음. (생물학적 성별을 기준으로 함)
    // 12시간 이내로 둘 다 의사를 표현하지 않으면 연결 요청이 자동으로 종료됨. -> Cache
    @PostMapping("/connections")
    fun applyConnection(
        memberId: Long
    ) {

    }

    // 연결 수락
    @PostMapping("/connections/approval")
    fun approveConnection(
        memberId: Long
    ) {

    }

    // 연결 거절
    @PostMapping("/connections/rejection")
    fun rejectConnection(
        memberId: Long
    ) {

    }

}
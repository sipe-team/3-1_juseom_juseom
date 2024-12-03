package com.official.cufitapi.domain.application

class NotificationMessageGenerator {
    companion object {
        @JvmStatic
        fun entryCompleteMessage(name: String): String {
            return "${name}님 후보자 입장 완료 \n ${name}님이 큐핏에 들어왔어요."
        }

        @JvmStatic
        fun requestConnectionMessage(fromName :String, toName :String) : String {
            return "${toName}님에게 하트 보내기 완료 \n ${fromName}님의 카드를 보냈어요."
        }

        @JvmStatic
        fun failureWithCase1(fromName :String, toName :String) : String {
            return "${toName}님에게 하트 보내기 완료 \n ${fromName}님의 카드를 보냈어요."
        }

        fun failureWithCase2(fromName :String, toName :String) : String {
            return "${toName}님에게 하트 보내기 완료\n ${fromName}님의 카드를 보냈어요."
        }

        fun failureWithCase3(name :String) : String {
            return "${name}님 연결되지 않았어요.\n 후보자 모두 하트를 거절했어요."
        }

    }
}

//    프로필 멘트
//    OOO님 등록 완료 OOO님이 프로필을 완성했어요.

//    연결 요청 멘트
//    OOO님에게 하트 보내기 완료 XXX님의 카드를 보냈어요.

//    case.1 실패 멘트 (12시간 지나도 누르지 않음)
//    OOO님 연결되지 않았어요. 12시간이 지나 연결 실패했어요.
//    case.2 실패 멘트 (상대후보자가 거절함)
//    OOO님 연결되지 않았어요. XXX님이 하트를 거절했어요.
//    case.2 실패 멘트 (내가 거절함)
//    OOO님 연결되지 않았어요. OOO님이 XXX님의 하트를 거절했어요.
//    case.3 실패 멘트 (둘다 거절함)
//    OOO님 연결되지 않았어요. 후보자 모두 하트를 거절했어요.
//}
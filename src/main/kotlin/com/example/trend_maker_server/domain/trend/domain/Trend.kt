package com.example.trend_maker_server.domain.trend.domain

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "trend")
class Trend(
    @Id
    val id: ObjectId = ObjectId.get(),

    var content: String,

    val user: String, // User로 이후에 변경

    val category: String,

    val createdDate: LocalDateTime,
    var updatedDate: LocalDateTime, // 로컬 말고 한국 시간으로 저장해야함.

    var recommendations: List<String> = arrayListOf(),
    var views: Int = 0
) {
}
/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val number: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.photo1, R.string.name1, 60410001, R.string.dog_description_1),
    Dog(R.drawable.photo2, R.string.name2, 60410002, R.string.dog_description_2),
    Dog(R.drawable.photo3, R.string.name3, 60410003, R.string.dog_description_3),
    Dog(R.drawable.photo4, R.string.name4, 60410004 , R.string.dog_description_4),
    Dog(R.drawable.photo5, R.string.name5, 60410005, R.string.dog_description_5),
    Dog(R.drawable.photo6, R.string.name6, 60410006, R.string.dog_description_6),
    Dog(R.drawable.photo7, R.string.name7, 60410007, R.string.dog_description_7),
    Dog(R.drawable.photo8, R.string.name8, 60410008, R.string.dog_description_8),
    Dog(R.drawable.photo9, R.string.name9, 60410009, R.string.dog_description_9),
    Dog(R.drawable.photo10, R.string.name10, 60410010, R.string.dog_description_10),
    Dog(R.drawable.photo11, R.string.name11, 60410011, R.string.dog_description_11),
    Dog(R.drawable.photo12, R.string.name12, 60410012, R.string.dog_description_12),
    Dog(R.drawable.photo13, R.string.name13, 60410013, R.string.dog_description_13),
    Dog(R.drawable.photo14, R.string.name14, 60410014, R.string.dog_description_14),
    Dog(R.drawable.photo15, R.string.name15, 60410015, R.string.dog_description_15),
    Dog(R.drawable.photo16, R.string.name16, 60410016, R.string.dog_description_16),
    Dog(R.drawable.photo17, R.string.name17, 60410017, R.string.dog_description_17),
    Dog(R.drawable.photo18, R.string.name18, 60410018, R.string.dog_description_18),
    Dog(R.drawable.photo19, R.string.name19, 60410019, R.string.dog_description_19),
    Dog(R.drawable.photo20, R.string.name20, 60410020, R.string.dog_description_20),
    Dog(R.drawable.photo21, R.string.name21, 60410021, R.string.dog_description_21),
    Dog(R.drawable.photo22, R.string.name22, 60410022, R.string.dog_description_22),
    Dog(R.drawable.photo23, R.string.name23, 60410023, R.string.dog_description_23),
    Dog(R.drawable.photo24, R.string.name24, 60410024, R.string.dog_description_24),
    Dog(R.drawable.photo25, R.string.name25, 60410025, R.string.dog_description_25),
    Dog(R.drawable.photo26, R.string.name26, 60410026, R.string.dog_description_26),
    Dog(R.drawable.photo27, R.string.name27, 60410027, R.string.dog_description_27),
    Dog(R.drawable.photo28, R.string.name28, 60410028, R.string.dog_description_28),
    Dog(R.drawable.photo29, R.string.name29, 60410029, R.string.dog_description_29),
    Dog(R.drawable.photo30, R.string.name30, 60410030, R.string.dog_description_30),
    Dog(R.drawable.photo31, R.string.name31, 60410031, R.string.dog_description_31),
    Dog(R.drawable.photo32, R.string.name32, 60410032, R.string.dog_description_32),
    Dog(R.drawable.photo33, R.string.name32, 60410032, R.string.dog_description_33),
    Dog(R.drawable.photo34, R.string.name32, 60410032, R.string.dog_description_34),
    Dog(R.drawable.photo35, R.string.name32, 60410032, R.string.dog_description_35),
    Dog(R.drawable.photo36, R.string.name32, 60410032, R.string.dog_description_36),
    Dog(R.drawable.photo37, R.string.name32, 60410032, R.string.dog_description_37),
    Dog(R.drawable.photo38, R.string.name32, 60410032, R.string.dog_description_38),
    Dog(R.drawable.photo39, R.string.name32, 60410032, R.string.dog_description_39),
    Dog(R.drawable.photo40, R.string.name32, 60410032, R.string.dog_description_40)


    )









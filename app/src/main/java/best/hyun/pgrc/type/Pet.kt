package best.hyun.pgrc.type

import android.graphics.Color


// 도감 : 이름, 종류, 환생, 획득방법, 메인속성, 서브속성, 메인속성값, 서브속성값, 1렙 최대값, maxLv최대값, 최대전체성장률, 최소 전체 성장률, 최대 각 스탯 성장률, 1렙 최소값, maxLv 최소값, 최소 각 스탯 성장률

enum class ELEMENTAL {
    EARTH, WATER, FIRE, WIND
}

enum class ELEMENTAL_COLOR(val rgb: Int) {
    EARTH(Color.rgb(0,180,0)), WATER(Color.BLUE), FIRE(Color.RED), WIND(Color.rgb(230,190,0))
}

enum class PET_TYPE {
    YANGIRO
}

abstract class Pet() {

    abstract val name:String
    abstract val type:PET_TYPE
    abstract var reincarnation:Boolean
    abstract val getRoute:String

    abstract val mainElemental:ELEMENTAL
    abstract val subElemental:ELEMENTAL?

    abstract val mainElementalValue:Int
    abstract val subElementalValue:Int

    abstract val initLv:Int
    abstract val initLvMaxHp:Int
    abstract val initLvMaxAtk:Int
    abstract val initLvMaxDef:Int
    abstract val initLvMaxSpd:Int

    abstract val maxLv:Int
    abstract val maxLvMaxHp:Int
    abstract val maxLvMaxAtk:Int
    abstract val maxLvMaxDef:Int
    abstract val maxLvMaxSpd:Int

    abstract val minAllGrowth:Float
    abstract val maxAllGrowth:Float

    abstract val maxHpGrowth:Float
    abstract val maxAtkGrowth:Float
    abstract val maxDefGrowth:Float
    abstract val maxSpdGrowth:Float


    abstract val initLvMinHp:Int
    abstract val initLvMinAtk:Int
    abstract val initLvMinDef:Int
    abstract val initLvMinSpd:Int

    abstract val maxLvMinHp:Int
    abstract val maxLvMinAtk:Int
    abstract val maxLvMinDef:Int
    abstract val maxLvMinSpd:Int

    abstract val minHpGrowth:Float
    abstract val minAtkGrowth:Float
    abstract val minDefGrowth:Float
    abstract val minSpdGrowth:Float

    abstract var nowLv: Int?
    abstract var nowHp:Int?
    abstract var nowAtk:Int?
    abstract var nowDef:Int?
    abstract var nowSpd:Int?
}
package best.hyun.pgrc.type

import android.graphics.Color
import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.logd
import best.hyun.pgrc.type.PET_TYPE.*
import best.hyun.pgrc.type.yangiro.Yangiro


enum class ELEMENTAL {
    EARTH, WATER, FIRE, WIND
}

enum class ELEMENTAL_COLOR(val rgb: Int) {
    EARTH(Color.rgb(0,180,0)), WATER(Color.BLUE), FIRE(Color.RED), WIND(Color.rgb(230,190,0))
}

enum class PET_TYPE(val serialNumber:Int, val typeName:String) {
    YANGIRO(500,  App.getString(R.string.type_yangiro)),
    OGAROS(600, App.getString(R.string.type_ogaros))
    ;

    override fun toString(): String = typeName
}

fun getSerialNumber(name:String) :Int {
    when(name) {
        App.getString(R.string.name_libino) -> { return YANGIRO.serialNumber + 1}
        App.getString(R.string.name_yangiro) -> { return YANGIRO.serialNumber + 2}
        App.getString(R.string.name_banboro) -> { return YANGIRO.serialNumber + 3}
        App.getString(R.string.name_bangino) -> { return YANGIRO.serialNumber + 4}
        App.getString(R.string.name_burudon) -> { return YANGIRO.serialNumber + 5}
        App.getString(R.string.name_gibino) -> { return YANGIRO.serialNumber + 6}
        App.getString(R.string.name_bino) -> { return YANGIRO.serialNumber + 7}
        App.getString(R.string.name_giro) -> { return YANGIRO.serialNumber + 8}
        App.getString(R.string.name_boro) -> { return YANGIRO.serialNumber + 9}
        App.getString(R.string.name_gino) -> { return YANGIRO.serialNumber + 10}
        App.getString(R.string.name_rudon) -> { return YANGIRO.serialNumber + 11}
        App.getString(R.string.name_ssagat) -> { return YANGIRO.serialNumber + 12}
        App.getString(R.string.name_teinos) -> { return YANGIRO.serialNumber + 13}

        App.getString(R.string.name_ogaros) -> { return OGAROS.serialNumber + 1}
        App.getString(R.string.name_orgon) -> { return OGAROS.serialNumber + 2}
        App.getString(R.string.name_mogaros) -> { return OGAROS.serialNumber + 3}
        App.getString(R.string.name_golos) -> { return OGAROS.serialNumber + 4}
        App.getString(R.string.name_norgon) -> { return OGAROS.serialNumber + 5}
        App.getString(R.string.name_pooryong) -> { return OGAROS.serialNumber + 6}
        App.getString(R.string.name_jigaros) -> { return OGAROS.serialNumber + 7}
        App.getString(R.string.name_kalos) -> { return OGAROS.serialNumber + 8}

        else -> { return -1 }
    }
}

// 도감 : 이름, 종류, 환생, 획득방법, 메인속성, 서브속성, 메인속성값, 서브속성값, 1렙 최대값, maxLv최대값, 최대전체성장률, 최소 전체 성장률, 최대 각 스탯 성장률, 1렙 최소값, maxLv 최소값, 최소 각 스탯 성장률
abstract class Pet() {

    abstract val serialnumber:Int

    abstract val name:String
    abstract val type:PET_TYPE
    abstract var reincarnation:Boolean
    abstract val getRoute:String

    abstract val mainElemental: ELEMENTAL
    abstract val subElemental: ELEMENTAL?

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

    abstract val initLvMinHp:Int
    abstract val initLvMinAtk:Int
    abstract val initLvMinDef:Int
    abstract val initLvMinSpd:Int

    abstract val maxLvMinHp:Int
    abstract val maxLvMinAtk:Int
    abstract val maxLvMinDef:Int
    abstract val maxLvMinSpd:Int

    abstract val minAllGrowth:Double
    abstract val maxAllGrowth:Double

    val maxHpGrowth: Double = (maxLvMaxHp - initLvMaxHp).toDouble() / (maxLv - initLv).toDouble()
    val maxAtkGrowth: Double = (maxLvMaxAtk - initLvMaxAtk).toDouble() / (maxLv - initLv).toDouble()
    val maxDefGrowth: Double = (maxLvMaxDef - initLvMaxDef).toDouble() / (maxLv - initLv).toDouble()
    val maxSpdGrowth: Double = (maxLvMaxSpd - initLvMaxSpd).toDouble() / (maxLv - initLv).toDouble()
    val minHpGrowth: Double = (maxLvMinHp - initLvMinHp).toDouble() / (maxLv - initLv).toDouble()
    val minAtkGrowth: Double = (maxLvMinAtk - initLvMinAtk).toDouble() / (maxLv - initLv).toDouble()
    val minDefGrowth: Double = (maxLvMinDef - initLvMinDef).toDouble() / (maxLv - initLv).toDouble()
    val minSpdGrowth: Double = (maxLvMinSpd - initLvMinSpd).toDouble() / (maxLv - initLv).toDouble()

}
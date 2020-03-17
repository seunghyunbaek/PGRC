package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet

class Gibino : Pet() {
    override val name: String
        get() = App.getString(R.string.name_gibino)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.name_gibino)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 59
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1455
    override val maxLvMaxAtk: Int
        get() = 350
    override val maxLvMaxDef: Int
        get() = 195
    override val maxLvMaxSpd: Int
        get() = 196
    override val minAllGrowth: Float
        get() = 4.427F
    override val maxAllGrowth: Float
        get() = 5.134F
    override val maxHpGrowth: Float
        get() = (maxLvMaxHp - initLvMaxHp).toFloat() / (maxLv - initLv).toFloat()
    override val maxAtkGrowth: Float
        get() = (maxLvMaxAtk - initLvMaxAtk).toFloat() / (maxLv - initLv).toFloat()
    override val maxDefGrowth: Float
        get() = (maxLvMaxDef - initLvMaxDef).toFloat() / (maxLv - initLv).toFloat()
    override val maxSpdGrowth: Float
        get() = (maxLvMaxSpd - initLvMaxSpd).toFloat() / (maxLv - initLv).toFloat()
    override val initLvMinHp: Int
        get() = 46
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1245
    override val maxLvMinAtk: Int
        get() = 311
    override val maxLvMinDef: Int
        get() = 157
    override val maxLvMinSpd: Int
        get() = 165
    override val minHpGrowth: Float
        get() = (maxLvMinHp - initLvMinHp).toFloat() / (maxLv - initLv).toFloat()
    override val minAtkGrowth: Float
        get() = (maxLvMinAtk - initLvMinAtk).toFloat() / (maxLv - initLv).toFloat()
    override val minDefGrowth: Float
        get() = (maxLvMinDef - initLvMinDef).toFloat() / (maxLv - initLv).toFloat()
    override val minSpdGrowth: Float
        get() = (maxLvMinSpd - initLvMinSpd).toFloat() / (maxLv - initLv).toFloat()
    override var nowLv: Int? = null
    override var nowHp: Int? = null
    override var nowAtk: Int? = null
    override var nowDef: Int? = null
    override var nowSpd: Int? = null
}
package best.hyun.pgrc.type.yangiro

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber
import java.math.RoundingMode
import java.text.DecimalFormat

class Yangiro : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_yangiro)
    override val type: PET_TYPE
        get() = PET_TYPE.YANGIRO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_yangiro)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 66
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1521
    override val maxLvMaxAtk: Int
        get() = 346
    override val maxLvMaxDef: Int
        get() = 203
    override val maxLvMaxSpd: Int
        get() = 176
    override val minAllGrowth: Double
        get() = 4.299
    override val maxAllGrowth: Double
        get() = 5.006
    override val initLvMinHp: Int
        get() = 52
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1310
    override val maxLvMinAtk: Int
        get() = 307
    override val maxLvMinDef: Int
        get() = 165
    override val maxLvMinSpd: Int
        get() = 145
}
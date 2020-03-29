package best.hyun.pgrc.type.woopu

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Otutu : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_otutu)
    override val type: PET_TYPE
        get() = PET_TYPE.WOOPU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_otutu)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 40
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1311
    override val maxLvMaxAtk: Int
        get() = 311
    override val maxLvMaxDef: Int
        get() = 195
    override val maxLvMaxSpd: Int
        get() = 228
    override val initLvMinHp: Int
        get() = 30
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1103
    override val maxLvMinAtk: Int
        get() = 273
    override val maxLvMinDef: Int
        get() = 157
    override val maxLvMinSpd: Int
        get() = 197
    override val minAllGrowth: Double
        get() = 4.432
    override val maxAllGrowth: Double
        get() = 5.139
}
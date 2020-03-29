package best.hyun.pgrc.type.boogi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Dolboogi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_dolboogi)
    override val type: PET_TYPE
        get() = PET_TYPE.BOOGI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_dolboogi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 90
    override val subElementalValue: Int
        get() = 10
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 45
    override val initLvMaxAtk: Int
        get() = 7
    override val initLvMaxDef: Int
        get() = 12
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1474
    override val maxLvMaxAtk: Int
        get() = 248
    override val maxLvMaxDef: Int
        get() = 401
    override val maxLvMaxSpd: Int
        get() = 65
    override val initLvMinHp: Int
        get() = 35
    override val initLvMinAtk: Int
        get() = 5
    override val initLvMinDef: Int
        get() = 10
    override val initLvMinSpd: Int
        get() = 0
    override val maxLvMinHp: Int
        get() = 1266
    override val maxLvMinAtk: Int
        get() = 210
    override val maxLvMinDef: Int
        get() = 363
    override val maxLvMinSpd: Int
        get() = 34
    override val minAllGrowth: Double
        get() = 4.290
    override val maxAllGrowth: Double
        get() = 4.997
}
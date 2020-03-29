package best.hyun.pgrc.type.boogi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kkoboogi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kkoboogi)
    override val type: PET_TYPE
        get() = PET_TYPE.BOOGI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kkoboogi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 45
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 11
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1429
    override val maxLvMaxAtk: Int
        get() = 311
    override val maxLvMaxDef: Int
        get() = 354
    override val maxLvMaxSpd: Int
        get() = 113
    override val initLvMinHp: Int
        get() = 35
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1220
    override val maxLvMinAtk: Int
        get() = 273
    override val maxLvMinDef: Int
        get() = 315
    override val maxLvMinSpd: Int
        get() = 82
    override val minAllGrowth: Double
        get() = 4.722
    override val maxAllGrowth: Double
        get() = 5.429
}
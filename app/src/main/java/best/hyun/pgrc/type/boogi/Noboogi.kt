package best.hyun.pgrc.type.boogi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Noboogi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_noboogi)
    override val type: PET_TYPE
        get() = PET_TYPE.BOOGI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_noboogi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 31
    override val initLvMaxAtk: Int
        get() = 5
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1475
    override val maxLvMaxAtk: Int
        get() = 250
    override val maxLvMaxDef: Int
        get() = 347
    override val maxLvMaxSpd: Int
        get() = 125
    override val initLvMinHp: Int
        get() = 25
    override val initLvMinAtk: Int
        get() = 4
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1268
    override val maxLvMinAtk: Int
        get() = 212
    override val maxLvMinDef: Int
        get() = 310
    override val maxLvMinSpd: Int
        get() = 94
    override val minAllGrowth: Double
        get() = 4.394
    override val maxAllGrowth: Double
        get() = 5.101
}
package best.hyun.pgrc.type.boogi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kkangboogi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kkangboogi)
    override val type: PET_TYPE
        get() = PET_TYPE.BOOGI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kkangboogi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 27
    override val initLvMaxAtk: Int
        get() = 4
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1450
    override val maxLvMaxAtk: Int
        get() = 262
    override val maxLvMaxDef: Int
        get() = 353
    override val maxLvMaxSpd: Int
        get() = 111
    override val initLvMinHp: Int
        get() = 21
    override val initLvMinAtk: Int
        get() = 3
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 1
    override val maxLvMinHp: Int
        get() = 1244
    override val maxLvMinAtk: Int
        get() = 225
    override val maxLvMinDef: Int
        get() = 315
    override val maxLvMinSpd: Int
        get() = 81
    override val minAllGrowth: Double
        get() = 4.437
    override val maxAllGrowth: Double
        get() = 5.144
}
package best.hyun.pgrc.type.samdusa

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Poongdusa : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_poongdusa)
    override val type: PET_TYPE
        get() = PET_TYPE.SAMDUSA
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_poongdusa)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 61
    override val initLvMaxAtk: Int
        get() = 15
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1510
    override val maxLvMaxAtk: Int
        get() = 376
    override val maxLvMaxDef: Int
        get() = 258
    override val maxLvMaxSpd: Int
        get() = 196
    override val initLvMinHp: Int
        get() = 48
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1300
    override val maxLvMinAtk: Int
        get() = 338
    override val maxLvMinDef: Int
        get() = 220
    override val maxLvMinSpd: Int
        get() = 165
    override val minAllGrowth: Double
        get() = 5.045
    override val maxAllGrowth: Double
        get() = 5.752
}
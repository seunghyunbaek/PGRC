package best.hyun.pgrc.type.beast

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class MecaWindHorse : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_mecawindhorse)
    override val type: PET_TYPE
        get() = PET_TYPE.BEAST
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_mecawindhorse)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val initLvMaxHp: Int
        get() = 88
    override val initLvMaxAtk: Int
        get() = 20
    override val initLvMaxDef: Int
        get() = 14
    override val initLvMaxSpd: Int
        get() = 14
    override val maxLv: Int
        get() = 140
    override val maxLvMaxHp: Int
        get() = 1515
    override val maxLvMaxAtk: Int
        get() = 361
    override val maxLvMaxDef: Int
        get() = 248
    override val maxLvMaxSpd: Int
        get() = 242
    override val initLvMinHp: Int
        get() = 69
    override val initLvMinAtk: Int
        get() = 17
    override val initLvMinDef: Int
        get() = 11
    override val initLvMinSpd: Int
        get() = 11
    override val maxLvMinHp: Int
        get() = 1302
    override val maxLvMinAtk: Int
        get() = 323
    override val maxLvMinDef: Int
        get() = 209
    override val maxLvMinSpd: Int
        get() = 210
    override val minAllGrowth: Double
        get() =5.088
    override val maxAllGrowth: Double
        get() = 5.795
}
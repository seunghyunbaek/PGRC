package best.hyun.pgrc.type.doori

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Woori : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_woori)
    override val type: PET_TYPE
        get() = PET_TYPE.DOORI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_woori)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 17
    override val initLvMaxAtk: Int
        get() = 2
    override val initLvMaxDef: Int
        get() = 2
    override val initLvMaxSpd: Int
        get() = 2
    override val maxLvMaxHp: Int
        get() = 1332
    override val maxLvMaxAtk: Int
        get() = 182
    override val maxLvMaxDef: Int
        get() = 203
    override val maxLvMaxSpd: Int
        get() = 239
    override val initLvMinHp: Int
        get() = 12
    override val initLvMinAtk: Int
        get() = 1
    override val initLvMinDef: Int
        get() = 1
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1087
    override val maxLvMinAtk: Int
        get() = 137
    override val maxLvMinDef: Int
        get() = 159
    override val maxLvMinSpd: Int
        get() = 203
    override val minAllGrowth: Double
        get() = 3.599
    override val maxAllGrowth: Double
        get() = 4.446
}
package best.hyun.pgrc.type.beron

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Beropori : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_beropori)
    override val type: PET_TYPE
        get() = PET_TYPE.BERON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_beropori)
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
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 50
    override val initLvMaxAtk: Int
        get() = 11
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1513
    override val maxLvMaxAtk: Int
        get() = 344
    override val maxLvMaxDef: Int
        get() = 227
    override val maxLvMaxSpd: Int
        get() = 154
    override val initLvMinHp: Int
        get() = 40
    override val initLvMinAtk: Int
        get() = 9
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1304
    override val maxLvMinAtk: Int
        get() = 306
    override val maxLvMinDef: Int
        get() = 189
    override val maxLvMinSpd: Int
        get() = 123
    override val minAllGrowth: Double
        get() = 4.351
    override val maxAllGrowth: Double
        get() = 5.058
}
package best.hyun.pgrc.type.beron

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Beronoku : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_beronoku)
    override val type: PET_TYPE
        get() = PET_TYPE.BERON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_beronoku)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.FIRE
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 59
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1515
    override val maxLvMaxAtk: Int
        get() = 362
    override val maxLvMaxDef: Int
        get() = 250
    override val maxLvMaxSpd: Int
        get() = 196
    override val initLvMinHp: Int
        get() = 47
    override val initLvMinAtk: Int
        get() = 11
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 5
    override val maxLvMinHp: Int
        get() = 1305
    override val maxLvMinAtk: Int
        get() = 323
    override val maxLvMinDef: Int
        get() = 212
    override val maxLvMinSpd: Int
        get() = 165
    override val minAllGrowth: Double
        get() = 4.898
    override val maxAllGrowth: Double
        get() = 5.605
}
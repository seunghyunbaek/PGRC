package best.hyun.pgrc.type.beron

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Beroroku : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_beroroku)
    override val type: PET_TYPE
        get() = PET_TYPE.BERON
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_beroroku)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
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
        get() = 43
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 7
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1493
    override val maxLvMaxAtk: Int
        get() = 338
    override val maxLvMaxDef: Int
        get() = 258
    override val maxLvMaxSpd: Int
        get() = 140
    override val initLvMinHp: Int
        get() = 34
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 5
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1284
    override val maxLvMinAtk: Int
        get() = 300
    override val maxLvMinDef: Int
        get() = 220
    override val maxLvMinSpd: Int
        get() = 109
    override val minAllGrowth: Double
        get() = 4.446
    override val maxAllGrowth: Double
        get() = 5.153
}
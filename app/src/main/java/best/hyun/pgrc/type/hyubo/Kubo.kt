package best.hyun.pgrc.type.hyubo

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber


class Kubo : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kubo)
    override val type: PET_TYPE
        get() = PET_TYPE.HYUBO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kubo)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 57
    override val initLvMaxAtk: Int
        get() = 13
    override val initLvMaxDef: Int
        get() = 10
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1499
    override val maxLvMaxAtk: Int
        get() = 348
    override val maxLvMaxDef: Int
        get() = 268
    override val maxLvMaxSpd: Int
        get() = 148
    override val initLvMinHp: Int
        get() = 44
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 8
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1289
    override val maxLvMinAtk: Int
        get() = 309
    override val maxLvMinDef: Int
        get() = 229
    override val maxLvMinSpd: Int
        get() = 116
    override val minAllGrowth: Double
        get() = 4.594
    override val maxAllGrowth: Double
        get() = 5.301
}
package best.hyun.pgrc.type.storaji

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Darinos : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_darinos)
    override val type: PET_TYPE
        get() = PET_TYPE.STORAJI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_darinos)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
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
        get() = 57
    override val initLvMaxAtk: Int
        get() = 10
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 5
    override val maxLvMaxHp: Int
        get() = 1645
    override val maxLvMaxAtk: Int
        get() = 295
    override val maxLvMaxDef: Int
        get() = 234
    override val maxLvMaxSpd: Int
        get() = 168
    override val initLvMinHp: Int
        get() = 46
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1436
    override val maxLvMinAtk: Int
        get() = 257
    override val maxLvMinDef: Int
        get() = 195
    override val maxLvMinSpd: Int
        get() = 137
    override val minAllGrowth: Double
        get() = 4.147
    override val maxAllGrowth: Double
        get() = 4.854
}